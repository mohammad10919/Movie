package ir.mohammad.movie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationdrawer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout=findViewById(R.id.drawerLayout);
        navigationdrawer=findViewById(R.id.nav);

        actionBarDrawerToggle= new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        bottomNavigationView =findViewById(R.id.bottomnavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this::onNavigationItemSelected);
        getSupportFragmentManager().beginTransaction().replace(R.id.FragmentLayout,new HomeFragment()).commit();
        navigationdrawer.setNavigationItemSelectedListener(this);

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.home) {
            Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
            openFragment(new HomeFragment());
            return true;
        } else if (item.getItemId() == R.id.city) {
            Toast.makeText(MainActivity.this, "city", Toast.LENGTH_SHORT).show();
            openFragment(new cityFragment());
            return true;
        } else if (item.getItemId() == R.id.message) {
            Toast.makeText(MainActivity.this, "message", Toast.LENGTH_SHORT).show();
            openFragment(new chatFragment());
            return true;
        } else if (item.getItemId() == R.id.url) {
            Toast.makeText(MainActivity.this, "url", Toast.LENGTH_SHORT).show();
            openFragment(new UrlFragment());
            return true;
        } else if (item.getItemId() == R.id.Profile) {
            Toast.makeText(MainActivity.this, "message", Toast.LENGTH_SHORT).show();
            openFragment(new chatFragment());

        }else if (item.getItemId() == R.id.setting) {
            Toast.makeText(MainActivity.this, "message", Toast.LENGTH_SHORT).show();
            openFragment(new chatFragment());
           }
        return false;

    }
    private void openFragment(Fragment fragment) {
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.FragmentLayout,fragment);
        transaction.commit();


    }
}