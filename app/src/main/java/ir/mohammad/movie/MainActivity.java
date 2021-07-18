package ir.mohammad.movie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import ir.mohammad.movie.Adapter.EstakhrAdapter;
import ir.mohammad.movie.Adapter.FilterAdapter;
import ir.mohammad.movie.Adapter.TablighAdapter;
import ir.mohammad.movie.Adapter.pishnahadAdapter;
import ir.mohammad.movie.model.Estakhr;
import ir.mohammad.movie.model.Filter;
import ir.mohammad.movie.model.Tabligh;
import ir.mohammad.movie.model.pishnahad;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout=findViewById(R.id.drawerLayout);

        actionBarDrawerToggle= new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        bottomNavigationView =findViewById(R.id.bottomnavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId()==R.id.home) {
                    Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                    openFragment(new HomeFragment());
                    return true;
                }else if (item.getItemId()==R.id.set){
                    Toast.makeText(MainActivity.this, "setting", Toast.LENGTH_SHORT).show();
                    openFragment(new settingFragment());
                    return true;
                }else if (item.getItemId()==R.id.message){
                    Toast.makeText(MainActivity.this, "message", Toast.LENGTH_SHORT).show();
                    openFragment(new chatFragment());
                    return true;

                }
                return false;
            }
        });
        getSupportFragmentManager().beginTransaction().replace(R.id.FragmentLayout,new HomeFragment()).commit();

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



    private void openFragment(Fragment fragment) {
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.FragmentLayout,fragment);
        transaction.commit();


}
}