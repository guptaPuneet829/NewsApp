package com.example.quickbate.Listeners;

import com.example.quickbate.Models.NewsHeadline;

import java.util.List;

public interface onFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadline> data, String message);
    void onError(String message);
}
