package com.binhdi0111.bka.ex7;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterDownloadVideo extends RecyclerView.Adapter<AdapterDownloadVideo.DownloadVideoViewHolder> {
    Context context;
    ArrayList<Url> arrayList;
    Example example;
    public AdapterDownloadVideo(Context context, ArrayList<Url> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public DownloadVideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_dowload,parent,false);
        return new AdapterDownloadVideo.DownloadVideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DownloadVideoViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Url url = arrayList.get(position);
        holder.txtName.setText(url.getName()+"");
        holder.txtSubName.setText(url.getSubname()+"");
        holder.btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startDownloadFile(url.getUrl());
            }
        });



    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class DownloadVideoViewHolder extends RecyclerView.ViewHolder {
        TextView txtName,txtSubName;
        Button btnDownload;
        public DownloadVideoViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = (TextView) itemView.findViewById(R.id.textViewName);
            txtSubName =(TextView) itemView.findViewById(R.id.textViewSubName);
            btnDownload = (Button) itemView.findViewById(R.id.buttonDownload);
        }
    }
    private Void startDownloadFile(String urlfile) {
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(urlfile));
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE|DownloadManager.Request.NETWORK_WIFI);
        request.setTitle("Download");
        request.setDescription("Download file.....");
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context, Environment.DIRECTORY_DOWNLOADS,String.valueOf(System.currentTimeMillis()));
        DownloadManager downloadManager = (DownloadManager)context.getSystemService(Context.DOWNLOAD_SERVICE);
        String fileName = URLUtil.guessFileName(urlfile, null, MimeTypeMap.getFileExtensionFromUrl(urlfile));
        if (downloadManager != null){
            downloadManager.enqueue(request);
        }
        Log.d("iiiiiiiiiiiiiii", "startDownloadFile: "+fileName);
        Intent intent = new Intent(context,Second_Activity.class);
        intent.putExtra("path",fileName);
        context.startActivity(intent);
        return null;
    }
}
