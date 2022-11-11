package com.luxoft.movies.Listeners;

import com.luxoft.movies.models.SearchApiResponse;

public interface OnSearchApiListener {
    void onResponse (SearchApiResponse response);
    void onError (String message);
}
