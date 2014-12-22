package com.systemboy.notificaciones;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    //Notificacion Simple
    /*
    public void showNoti(View e){
        int notificadtionId=101;
        Intent viewIntent = new Intent(this, SecondActivity.class);
        PendingIntent viewPendingIntent =
                PendingIntent.getActivity(this, 0, viewIntent, 0);
        NotificationCompat.Builder notificationBuilder =
                new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_launcher)
                .setContentTitle("Dany Prueba")
                .setContentText("It´s demo of simple notification")
                .setContentIntent(viewPendingIntent);

        NotificationManagerCompat notificationManagerCompat=
                NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(notificadtionId,notificationBuilder.build());
    }*/

    //Notificacion con icono, y funcionalidad extra
    /*
    Se tienen dos intents porque uno funciona normal el que dice abrir en el telefono
    este abre la actividad en el telefono marcada.
    La segunda actividad es la que se genera con el icono, la cadena de texto y te
    puede llevar a otra actividad o a otro intent.
    puede llevar a otra actividad o a otro intent.
     */
   /* public void showNoti(View e){
        int notificadtionId=101;
        Intent viewIntent = new Intent(this, SecondActivity.class);
        PendingIntent viewPendingIntent =
                PendingIntent.getActivity(this, 0, viewIntent, 0);
        Intent urlIntent = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse("http://www.google.com");
        urlIntent.setData(uri);
        PendingIntent urlPendingIntent =
                PendingIntent.getActivity(this, 0, urlIntent, 0);
        NotificationCompat.Builder notificationBuilder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.ic_launcher)
                        .setContentTitle("Dany Prueba")
                        .setContentText("It´s demo of simple notification")
                        .setContentIntent(viewPendingIntent)
                .addAction(R.drawable.abc_ic_search_api_mtrl_alpha,"Buscar",urlPendingIntent);

        NotificationManagerCompat notificationManagerCompat=
                NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(notificadtionId,notificationBuilder.build());
    }/*

    /**
     * Acciones especificas para Android Wear
    */
    public void showNoti(View e){
        int notificadtionId=101;
        Intent actionIntent= new Intent(this,SecondActivity.class);
        PendingIntent actionPendingIntent = PendingIntent.getActivity(this, 0, actionIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Action action = new NotificationCompat.Action.Builder(R.drawable.abc_ic_menu_share_mtrl_alpha,
                getString(R.string.hello_world),actionPendingIntent).build();
        Notification notification = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_launcher)
                .setContentTitle(getString(R.string.hola))
                .setContentText(getString(R.string.adios))
                .extend(new NotificationCompat.WearableExtender().addAction(action))
                .build();
        NotificationManagerCompat notificationManagerCompat=
                NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(notificadtionId,notification);
    }

/**
 * Añadiendo una gran vista para android wear
 */
/*
public void showNoti(View e){
    int notificadtionId=101;
    Intent actionIntent= new Intent(this,SecondActivity.class);
    PendingIntent actionPendingIntent = PendingIntent.getActivity(this, 0, actionIntent, PendingIntent.FLAG_UPDATE_CURRENT);

    NotificationCompat.BigTextStyle bigStyle = new NotificationCompat.BigTextStyle();
    bigStyle.bigText("hjsdhhhjjhdshjdfsjhfdsjhfdshjdsfhsfdhj");


    NotificationCompat.Action action = new NotificationCompat.Action.Builder(R.drawable.abc_ic_menu_share_mtrl_alpha,
            getString(R.string.hello_world),actionPendingIntent).build();
    Notification notification = new NotificationCompat.Builder(this)
            .setSmallIcon(R.drawable.ic_launcher)
            .setContentTitle(getString(R.string.hola))
            .setContentText(getString(R.string.adios))
            .setLargeIcon(BitmapFactory.decodeResource(
                    getResources(), R.drawable.ic_launcher))

            .extend(new NotificationCompat.WearableExtender().addAction(action))
            .setStyle(bigStyle)
            .build();
    NotificationManagerCompat notificationManagerCompat=
            NotificationManagerCompat.from(this);
    notificationManagerCompat.notify(notificadtionId,notification);
}*/
}
