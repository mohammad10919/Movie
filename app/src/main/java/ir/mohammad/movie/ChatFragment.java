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

import ir.mohammad.movie.Adapter.ChatAdapter;
import ir.mohammad.movie.model.Chat;


public class ChatFragment extends Fragment {

    private List<Chat> chat=new ArrayList<>();
    private ChatAdapter chatAdapter;
    private RecyclerView recyclerViewchat;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_chat, container, false);
        recyclerViewchat=(RecyclerView) view.findViewById(R.id.recycler_chat);
        chatAdapter=new ChatAdapter(chat);
        recyclerViewchat.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        recyclerViewchat.setAdapter(chatAdapter);

        chat.add(new Chat("mohammad","https://setare.com/files/fa/news/1398/11/29/348852_755.jpg"));
        chat.add(new Chat("mohammad","https://setare.com/files/fa/news/1398/11/29/348854_531.jpg"));
        chat.add(new Chat("mohammad","https://setare.com/files/fa/news/1398/11/29/348858_646.jpg"));
        chat.add(new Chat("mohammad","https://setare.com/files/fa/news/1398/11/29/348860_907.jpg"));
        chat.add(new Chat("mohammad","https://setare.com/files/fa/news/1398/11/29/348864_315.jpg"));
        chat.add(new Chat("mohammad","https://setare.com/files/fa/news/1398/11/29/348866_391.jpg"));
        chat.add(new Chat("mohammad","https://setare.com/files/fa/news/1398/11/29/348870_352.jpg"));
        chat.add(new Chat("mohammad","https://setare.com/files/fa/news/1398/11/29/348856_401.jpg"));
        chat.add(new Chat("mohammad","https://cdn.nody.ir/files/2021/05/11/nody-%D8%B9%DA%A9%D8%B3-%D9%BE%D8%B1%D9%88%D9%81%D8%A7%DB%8C%D9%84-%D9%BE%D8%B3%D8%B1%D8%A7%D9%86%D9%87-%DA%A9%D9%84%D8%A7%D8%B3%DB%8C%DA%A9-1620734423.jpg"));
        chat.add(new Chat("mohammad","https://cdn.nody.ir/files/2021/05/11/nody-%D8%B9%DA%A9%D8%B3-%DA%A9%D9%84%D8%A7%D8%B3%DB%8C%DA%A9-%D8%A8%D8%B1%D8%A7%DB%8C-%D9%BE%D8%B1%D9%88%D9%81%D8%A7%DB%8C%D9%84-%D9%BE%D8%B3%D8%B1%D8%A7%D9%86%D9%87-1620734424.jpg"));
        chat.add(new Chat("mohammad","https://www.iranve.com/wp-content/uploads/2021/04/image-profile-khafan-boy-Uilkasd8673245-2.jpg"));
        chat.add(new Chat("mohammad","https://setare.com/files/fa/news/1398/11/29/348856_401.jpg"));

        return view;

    }
}