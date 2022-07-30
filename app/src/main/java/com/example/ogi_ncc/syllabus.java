package com.example.ogi_ncc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class syllabus extends AppCompatActivity {

    private ListView listView;
    DatabaseReference db;
    List<uploadPDF> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        listView = findViewById(R.id.listview1);
        list = new ArrayList<>();

        viewAllFiles();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                uploadPDF uploadPDF = list.get(position);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.parse(uploadPDF.getUrl()),"*/*");
                startActivity(intent);

            }

        });
    }

    private void viewAllFiles() {

        db = FirebaseDatabase.getInstance().getReference("Syllabus");
        db.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot postSnapshot: dataSnapshot.getChildren()){

                    uploadPDF uploadPDF = postSnapshot.getValue(com.example.ogi_ncc.uploadPDF.class);
                    list.add(uploadPDF);
                }

                String[] uploads = new String[(list.size())];

                for (int i =0;i<uploads.length;i++){
                    uploads[i] = list.get(i).getNme();
                }

                ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, uploads);
                listView.setAdapter(arrayAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}