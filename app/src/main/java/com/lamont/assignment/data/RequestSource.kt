package com.lamont.assignment.data

import com.lamont.assignment.model.Request

class RequestSource {
    fun loadRequests(): List<Request>{

        return listOf<Request>(
            Request("KaeLun", "I need an Ipad 9th for education purpose.", "Education"),
            Request("Jessie", "I need an Iphone 13ProMax for education purpose. HahahahahaHahahahahaHahahahahaHahahahahaI need an Iphone 13ProMax for education purpose. HahahahahaHahahahahaHahahahahaHahahahaha", "Education") ,
            Request("KaeLun", "I need an Ipad 9th for education purpose.", "Education"),
            Request("Jessie", "I need an Iphone 13ProMax for education purpose. HahahahahaHahahahahaHahahahahaHahahahahaI need an Iphone 13ProMax for education purpose. HahahahahaHahahahahaHahahahahaHahahahaha", "Education") ,
            Request("KaeLun", "I need an Ipad 9th for education purpose.", "Education"),
            Request("Jessie", "I need an Iphone 13ProMax for education purpose. HahahahahaHahahahahaHahahahahaHahahahahaI need an Iphone 13ProMax for education purpose. HahahahahaHahahahahaHahahahahaHahahahaha", "Education"),
            Request("KaeLun", "I need an Ipad 9th for education purpose.", "Education"),

        )
    }
}