package com.example.notificaciones;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;

public class NotificationView extends Activity {
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notification);
	
	//--Buscar el servicio de gestor de notificaciones---
	NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
	//--Cancelar la notificación que hemos iniciado
	nm.cancel(getIntent().getExtras().getInt("notificationID"));
	}
}
