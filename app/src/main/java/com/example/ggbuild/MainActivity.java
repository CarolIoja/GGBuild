package com.example.ggbuild;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.ggbuild.Amumu.ActivityAmumuBuild;
import com.example.ggbuild.Anivia.ActivityAniviaBuild;
import com.example.ggbuild.Braum.ActivityBraumBuild;
import com.example.ggbuild.Caitlyn.ActivityCaitlynBuild;
import com.example.ggbuild.Gnar.ActivityGnarBuild;
import com.example.ggbuild.Jhin.ActivityJhinBuild;
import com.example.ggbuild.Kennen.ActivityKennenBuild;
import com.example.ggbuild.Khazix.ActivityKhazixBuild;
import com.example.ggbuild.Kindred.ActivityKindredBuild;
import com.example.ggbuild.Leblanc.ActivityLeblancBuild;
import com.example.ggbuild.Leesin.ActivityLeesinBuild;
import com.example.ggbuild.Lucian.ActivityLucianBuild;
import com.example.ggbuild.Mordekaiser.ActivityMordekaiserBuild;
import com.example.ggbuild.Nasus.ActivityNasusBuild;
import com.example.ggbuild.Nautilius.ActivityNautiliusBuild;
import com.example.ggbuild.Olaf.ActivityOlafBuild;
import com.example.ggbuild.Orianna.ActivityOriannaBuild;
import com.example.ggbuild.Pantheon.ActivityPantheonBuild;
import com.example.ggbuild.Pyke.ActivityPykeBuild;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView amumu = (ImageView) findViewById(R.id.amumu);
        ImageView anivia = (ImageView) findViewById(R.id.anivia);
        ImageView braum = (ImageView) findViewById(R.id.braum);
        ImageView caitlyn = (ImageView) findViewById(R.id.caitlyn);
        ImageView gnar = (ImageView) findViewById(R.id.gnar);
        ImageView jhin = (ImageView) findViewById(R.id.jhin);
        ImageView kennen = (ImageView) findViewById(R.id.kennen);
        ImageView khazix = (ImageView) findViewById(R.id.khazix);
        ImageView kindred = (ImageView) findViewById(R.id.kindred);
        ImageView leblanc = (ImageView) findViewById(R.id.leblanc);
        ImageView leesin = (ImageView) findViewById(R.id.leesin);
        ImageView lucian = (ImageView) findViewById(R.id.lucian);
        ImageView mordekaiser = (ImageView) findViewById(R.id.mordekaiser);
        ImageView nasus = (ImageView) findViewById(R.id.nasus);
        ImageView nautilius = (ImageView) findViewById(R.id.nautilius);
        ImageView olaf = (ImageView) findViewById(R.id.olaf);
        ImageView orianna = (ImageView) findViewById(R.id.orianna);
        ImageView pantheon = (ImageView) findViewById(R.id.pantheon);
        ImageView pyke = (ImageView) findViewById(R.id.pyke);

        Button searchButton = (Button) findViewById(R.id.searchButton);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent search = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(search);
            }
        });


        amumu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent amumuBuild = new Intent(MainActivity.this, ActivityAmumuBuild.class);
                Toast.makeText(getApplicationContext(),"Amumu Build...", Toast.LENGTH_SHORT).show();
                startActivity(amumuBuild);
            }
        });


        anivia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent aniviaBuild = new Intent(MainActivity.this, ActivityAniviaBuild.class);
                Toast.makeText(getApplicationContext(),"Anivia Build...", Toast.LENGTH_SHORT).show();
                startActivity(aniviaBuild);
            }
        });

        braum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent braumBuild = new Intent(MainActivity.this, ActivityBraumBuild.class);
                Toast.makeText(getApplicationContext(),"Braum Build...", Toast.LENGTH_SHORT).show();
                startActivity(braumBuild);
            }
        });

        caitlyn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent caitlynBuild = new Intent(MainActivity.this, ActivityCaitlynBuild.class);
                Toast.makeText(getApplicationContext(),"Caitlyn Build...", Toast.LENGTH_SHORT).show();
                startActivity(caitlynBuild);
            }
        });

        gnar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent gnarBuild = new Intent(MainActivity.this, ActivityGnarBuild.class);
                Toast.makeText(getApplicationContext(),"Gnar Build...", Toast.LENGTH_SHORT).show();
                startActivity(gnarBuild);
            }
        });

        jhin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent jhinBuild = new Intent(MainActivity.this, ActivityJhinBuild.class);
                Toast.makeText(getApplicationContext(),"Jhin Build...", Toast.LENGTH_SHORT).show();
                startActivity(jhinBuild);
            }
        });

        kennen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent kennenBuild = new Intent(MainActivity.this, ActivityKennenBuild.class);
                Toast.makeText(getApplicationContext(),"Kennen Build...", Toast.LENGTH_SHORT).show();
                startActivity(kennenBuild);
            }
        });

        khazix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent khazixBuild = new Intent(MainActivity.this, ActivityKhazixBuild.class);
                Toast.makeText(getApplicationContext(),"Kha'Zix Build...", Toast.LENGTH_SHORT).show();
                startActivity(khazixBuild);
            }
        });

        kindred.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent kindredBuild = new Intent(MainActivity.this, ActivityKindredBuild.class);
                Toast.makeText(getApplicationContext(),"Kindred Build...", Toast.LENGTH_SHORT).show();
                startActivity(kindredBuild);
            }
        });

        leblanc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent leblancBuild = new Intent(MainActivity.this, ActivityLeblancBuild.class);
                Toast.makeText(getApplicationContext(),"LeBlanc Build...", Toast.LENGTH_SHORT).show();
                startActivity(leblancBuild);
            }
        });

        leesin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent leesinBuild = new Intent(MainActivity.this, ActivityLeesinBuild.class);
                Toast.makeText(getApplicationContext(),"Lee Sin Build...", Toast.LENGTH_SHORT).show();
                startActivity(leesinBuild);
            }
        });

        lucian.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent lucianBuild = new Intent(MainActivity.this, ActivityLucianBuild.class);
                Toast.makeText(getApplicationContext(),"Lucian Build...", Toast.LENGTH_SHORT).show();
                startActivity(lucianBuild);
            }
        });

        mordekaiser.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent mordekaiserBuild = new Intent(MainActivity.this, ActivityMordekaiserBuild.class);
                Toast.makeText(getApplicationContext(),"Mordekaiser Build...", Toast.LENGTH_SHORT).show();
                startActivity(mordekaiserBuild);
            }
        });

        nasus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent nasusBuild = new Intent(MainActivity.this, ActivityNasusBuild.class);
                Toast.makeText(getApplicationContext(),"Nasus Build...", Toast.LENGTH_SHORT).show();
                startActivity(nasusBuild);
            }
        });

        nautilius.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent nautiliusBuild = new Intent(MainActivity.this, ActivityNautiliusBuild.class);
                Toast.makeText(getApplicationContext(),"Nautilius Build...", Toast.LENGTH_SHORT).show();
                startActivity(nautiliusBuild);
            }
        });

        olaf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent olafBuild = new Intent(MainActivity.this, ActivityOlafBuild.class);
                Toast.makeText(getApplicationContext(),"Olaf Build...", Toast.LENGTH_SHORT).show();
                startActivity(olafBuild);
            }
        });

        orianna.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent oriannaBuild = new Intent(MainActivity.this, ActivityOriannaBuild.class);
                Toast.makeText(getApplicationContext(),"Orianna Build...", Toast.LENGTH_SHORT).show();
                startActivity(oriannaBuild);
            }
        });

        pantheon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent pantheonBuild = new Intent(MainActivity.this, ActivityPantheonBuild.class);
                Toast.makeText(getApplicationContext(),"Pantheon Build...", Toast.LENGTH_SHORT).show();
                startActivity(pantheonBuild);
            }
        });

        pyke.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent pykeBuild = new Intent(MainActivity.this, ActivityPykeBuild.class);
                Toast.makeText(getApplicationContext(),"Pyke Build...", Toast.LENGTH_SHORT).show();
                startActivity(pykeBuild);
            }
        });






    }



}