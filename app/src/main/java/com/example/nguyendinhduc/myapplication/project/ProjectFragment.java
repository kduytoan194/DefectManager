package com.example.nguyendinhduc.myapplication.project;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.nguyendinhduc.myapplication.Constant;
import com.example.nguyendinhduc.myapplication.R;
import com.example.nguyendinhduc.myapplication.project.CreateProjectActivity;
import com.example.nguyendinhduc.myapplication.project.DetailProjectActivity;
import com.example.nguyendinhduc.myapplication.project.ProjectAdapter;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

import static com.example.nguyendinhduc.myapplication.Constant.PROJECT_TABLE;
import static com.example.nguyendinhduc.myapplication.Constant.PROJECT_USER;
import static com.example.nguyendinhduc.myapplication.Constant.USER_TABLE;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProjectFragment extends Fragment {
    ListView projectList;
    ProjectAdapter adapter;
    Context context;
    FloatingActionButton createProject;

    public ProjectFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_project, container, false);
        projectList = (ListView) view.findViewById(R.id.projectList);
        createProject = (FloatingActionButton) view.findViewById(R.id.createProject);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ParseQuery<ParseObject> query = ParseQuery.getQuery(PROJECT_TABLE);
        query.include(PROJECT_USER);
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if (e == null) {
                    adapter = new ProjectAdapter(context, R.layout.item_project_list, objects);
                    projectList.setAdapter(adapter);
                    projectList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent intent = new Intent(getContext(), DetailProjectActivity.class);
                            startActivity(intent);
                        }
                    });
                }
            }
        });

        createProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), CreateProjectActivity.class);
                startActivity(intent);
            }
        });
    }
}
