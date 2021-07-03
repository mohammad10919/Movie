package ir.mohammad.movie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
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

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottomnavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId()==R.id.home) {
                    Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                    openFragment(new HomeFragment());
                    return true;
                }else if (item.getItemId()==R.id.setting){
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
    private void openFragment(Fragment fragment) {
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.FragmentLayout,fragment);
        transaction.commit();


}
}