package com.example.cameratest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cameratest.view.MySurfaceView;

public class CameraOverlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_overlay);

        Button shutterButton = findViewById(R.id.shutter_button);
        shutterButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                MySurfaceView.takePicture();
            }
        });
    }
}
