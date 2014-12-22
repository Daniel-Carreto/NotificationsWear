package com.example.notificaciones;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {

	int notificationID=1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void display(View v){
		displayNotification();
	}
	public void displayNotification(){
		//--PendingIntent para lanzar una actividad si el usario selecciona esta notifiacion--
		Intent i= new Intent(this,NotificationView.class);
		i.putExtra("notificationID", notificationID);
		PendingIntent pendingIntent=  PendingIntent.getActivity(this,0,i,0);
		NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		Notification notif = new Notification(
				R.drawable.ic_launcher,
				"Reminder:Meeting start in 5 minutes",
				System.currentTimeMillis());
		CharSequence from="System Alarm";
		CharSequence message = "Meeting with customer at 3pm..";
		notif.setLatestEventInfo(this, from, message,pendingIntent);
		//--100ms de espera vibrar durante 250ms, parar urante 100ms y luego vibrar durante 500ms
		notif.vibrate= new long[] {100,250,100,500};
		nm.notify(notificationID,notif);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
