package net.dika.tgskel7d;

//Created by andika.mar

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {
    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener authListener;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Pengambilan data, apakah ada yang login.
        auth = FirebaseAuth.getInstance();
        final FirebaseUser user = auth.getCurrentUser();
        //Pengecekan, jika tidak ada login. Di arahkan ke Login activity.
        if (user == null) {
            startActivity(new Intent(MainActivity.this, Login.class));
            finish();
        }
        logout = findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Logout user dan alihkan ke form login.
                auth.signOut();
                startActivity(new Intent(MainActivity.this, Login.class));
                finish();
            }
        });
        //
    }
}
