package com.lamont.assignment.data

import com.lamont.assignment.model.Request

class RequestSource {
    fun loadRequests(): List<Request>{

        return listOf<Request>(
            Request("KaeLun", "I need an Ipad 9th for education purpose.", "Education")
        )
    }
}