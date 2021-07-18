package ir.mohammad.movie;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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


public class HomeFragment extends Fragment {

    private List<Filter> filter=new ArrayList<>();
    private List<Tabligh>tabligh=new ArrayList<>();
    private List<pishnahad>pishnahad=new ArrayList<>();
    private List<Estakhr>estakhr=new ArrayList<>();
    private RecyclerView recyclerViewfilter;
    private RecyclerView recyclerViewtabligh;
    private RecyclerView recyclerViewpishnahad;
    private RecyclerView recyclerViewestakhr;
    private EstakhrAdapter estakhrAdapter;
    private FilterAdapter filterAdapter;
    private ir.mohammad.movie.Adapter.pishnahadAdapter pishnahadAdapter;
    private TablighAdapter tablighAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home, container, false);

        recyclerViewfilter=(RecyclerView) view.findViewById(R.id.recycler_filter);
        filterAdapter=new FilterAdapter(filter);
        recyclerViewfilter.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        recyclerViewfilter.setAdapter(filterAdapter);
        filter.add(new Filter("رستوران"));
        filter.add(new Filter("تفریحی"));
        filter.add(new Filter("ورزشی"));
        filter.add(new Filter("سلامتی"));
        filter.add(new Filter("زیبایی"));
        filter.add(new Filter("هنر "));

        recyclerViewtabligh=(RecyclerView) view.findViewById(R.id.recycler_baner);
        tablighAdapter=new TablighAdapter(tabligh);
        recyclerViewtabligh.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        recyclerViewtabligh.setAdapter(tablighAdapter);

        tabligh.add(new Tabligh("https://cdn.takhfifan.com/images/1.0?id=/153465/p/a/paro5lxnfxqlnhzvcs48yg_1.jpg"));
        tabligh.add(new Tabligh("https://cdn.takhfifan.com/images/1.0?id=/180215/1/_/1_4__32_20.jpg"));
        tabligh.add(new Tabligh("https://cdn.takhfifan.com/images/1.0?id=/184485/1/_/1_954_80.jpg"));
        tabligh.add(new Tabligh("https://cdn.takhfifan.com/images/1.0?id=/202880/y/h/yhgdfsdrf.jpg"));

        recyclerViewpishnahad=(RecyclerView) view.findViewById(R.id.recycler_pishnahad);
        pishnahadAdapter=new pishnahadAdapter(pishnahad);
        recyclerViewpishnahad.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        recyclerViewpishnahad.setAdapter(pishnahadAdapter);

        pishnahad.add(new pishnahad("https://cdn.takhfifan.com/images/1.0?id=/142203/2/_/2_954_21.jpg","تله کابین 1 به 7 توچال","ولنجک","66,500"));
        pishnahad.add(new pishnahad("https://cdn.takhfifan.com/images/1.0?id=/97584/f/i/first_28_29_2_1_1_1.jpg","بازدید از برج میلاد","برج میلاد","39,200"));
        pishnahad.add(new pishnahad("https://cdn.takhfifan.com/images/1.0?id=/104541/3/1/31556657_239636886787362_3586279060591869952_n.jpg","کاربازیا:شهر خلاقیت...","برج میلاد","47,500"));
        pishnahad.add(new pishnahad("https://cdn.takhfifan.com/images/1.0?id=/199735/_/1/_1__630_32_1_1.jpg","رویا پارک","نیاوران","52,500"));
        pishnahad.add(new pishnahad("https://cdn.takhfifan.com/images/1.0?id=/82288/_/5/_5__330_17.jpg","هیجان در بولینگ","شیان","52,500"));

        recyclerViewestakhr=(RecyclerView) view.findViewById(R.id.recycler_estakhr);
        estakhrAdapter=new EstakhrAdapter(estakhr);
        recyclerViewestakhr.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        recyclerViewestakhr.setAdapter(estakhrAdapter);

        estakhr.add(new Estakhr("https://cdn.takhfifan.com/images/1.0?id=/109626/1/3/13_90_24.jpg","استخر روباز اکباتان","شهرک","60,000"));
        estakhr.add(new Estakhr("https://cdn.takhfifan.com/images/1.0?id=/153465/p/a/paro5lxnfxqlnhzvcs48yg_1.jpg","استخر روباز ارم هاوانا","کوی ارم","60,000"));
        estakhr.add(new Estakhr("https://cdn.takhfifan.com/images/1.0?id=/121937/f/i/first_215_3_1_1_1.jpg","استخر روباز بلوط ولنجک","ولنجک","52,000"));
        estakhr.add(new Estakhr("https://cdn.takhfifan.com/images/1.0?id=/153229/1/_/1_21__6.jpg","زمزم،لوکس ترین استخر و..","حکیمیه","56,000"));
        estakhr.add(new Estakhr("https://cdn.takhfifan.com/images/1.0?id=/132677/1/_/1_1_8.jpeg","استخر چهار فصل باربد","قیطریه","75,000"));


        return view;
    }
}