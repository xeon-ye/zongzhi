package com.weique.overhaul.v2.mvp.ui.activity.chat.voip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.dds.skywebrtc.SkyEngineKit;
import com.jess.arms.integration.AppManager;

/**
 * Created by dds on 2019/8/25.
 * android_shuai@163.com
 */
public class VoipReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (Utils.ACTION_VOIP_RECEIVER.equals(action)) {
            String room = intent.getStringExtra("room");
            boolean audioOnly = intent.getBooleanExtra("audioOnly", true);
            String inviteId = intent.getStringExtra("inviteId");
            String userList = intent.getStringExtra("userList");
            String[] list = userList.split(",");
            SkyEngineKit.init(new VoipEvent());
            boolean b = SkyEngineKit.Instance().startInCall(AppManager.getAppManager().getmApplication(), room, inviteId, audioOnly);
            if (b) {
                if (list.length == 1) {
                    CallSingleActivity.openActivity(context, inviteId, false, audioOnly);
                } else {
                    // 群聊
                }

            }


        }

    }
}
