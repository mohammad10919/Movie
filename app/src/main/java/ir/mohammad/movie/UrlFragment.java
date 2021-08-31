package ir.mohammad.movie;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import ir.mohammad.movie.Adapter.ChatAdapter;
import ir.mohammad.movie.Adapter.UrlmodelAdapter;
import ir.mohammad.movie.Adapter.WebimageAdapter;
import ir.mohammad.movie.model.Urlinjson;
import ir.mohammad.movie.model.Urlmodel;

public class UrlFragment extends Fragment {
    private RecyclerView recyclerViewparent;
    private List<Urlinjson> urlinjsons;
    private UrlmodelAdapter urlmodelAdapter;
    private List<Webimagemodel>webimagemodels;
    private WebimageAdapter webimageAdapter;
    private RecyclerView recyclerViewwebimage;
    Context context;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_url, container, false);
        recyclerViewparent = view.findViewById(R.id.recyclerurl);
        recyclerViewparent.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerViewwebimage=view.findViewById(R.id.web_recycler);
        recyclerViewwebimage.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        RequestQueue queue = Volley.newRequestQueue(context);
        String Divarurl = "http://127.0.0.1:5000/";
        StringRequest stringRequest = new StringRequest(Request.Method.GET, Divarurl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONArray jsonArrayparent=new JSONArray(Divarurl);
                    Urlmodel urlmodel=new Urlmodel();
                    for (int i=0; i<jsonArrayparent.length(); i++){
                        JSONObject jsonObject=jsonArrayparent.getJSONObject(i);
                        Urlinjson urlparent=new Urlinjson();
                        urlparent.setTitle(jsonObject.getString("title"));
                        urlparent.setTitle(jsonObject.getString("description"));
                        urlparent.setTitle(jsonObject.getString("price"));
                        urlparent.setTitle(jsonObject.getString("date"));
                        urlparent.setTitle(jsonObject.getString("city"));
                        urlparent.setTitle(jsonObject.getString("thumbnail"));
                        urlparent.setLatitude(jsonObject.getInt("latitude"));
                        urlparent.setLongitude(jsonObject.getInt("longitude"));
                        JSONArray jsonarryweb=jsonObject.getJSONArray("web_images");
                        for (int a = 0 ; a<jsonarryweb.length();a++){
                            JSONArray ja=jsonarryweb.getJSONArray(a);
                            for (int b = 0 ; b<ja.length();b++){
                                JSONObject jsonObject1=jsonarryweb.getJSONObject(b);
                                Webimagemodel webimagemodel=new Webimagemodel();
                                webimagemodel.setSrc(jsonObject1.getString("src"));
                                webimagemodel.setSrc(jsonObject1.getString("type"));
                                webimagemodels.add(webimagemodel);

                            }
                             urlparent.setWeb_image(webimagemodels);
                            webimageAdapter =new WebimageAdapter(webimagemodels);
                            recyclerViewwebimage.setAdapter(urlmodelAdapter);
                            }

                        urlinjsons.add(urlparent);
                    }

                    urlmodel.setUrlinjsons(urlinjsons);
                     urlmodelAdapter=new UrlmodelAdapter(urlinjsons);
                    recyclerViewparent.setAdapter(urlmodelAdapter);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        } ,new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(stringRequest);

            return view;
    }

}