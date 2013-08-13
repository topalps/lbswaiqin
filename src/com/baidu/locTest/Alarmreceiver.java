package com.baidu.locTest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Alarmreceiver extends BroadcastReceiver {  
    @Override  
    public void onReceive(Context context, Intent intent) {  
  
        if (intent.getAction().equals("arui.alarm.action")) {  
            Intent i = new Intent();  
            i.setClass(context, LocationReportService.class);  
            // ����service   
            // ��ε���startService�������������service ���ǻ��ε���onStart  
            context.startService(i);  
        	Toast.makeText(context, "�ƶ���λ��������", Toast.LENGTH_LONG).show();
        }  
    }  
}
