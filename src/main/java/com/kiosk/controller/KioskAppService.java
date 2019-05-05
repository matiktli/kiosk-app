package com.kiosk.controller;

import com.kiosk.dto.BaseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

public interface KioskAppService<T extends BaseDTO> {

    public static final String BASE_URL = "/kiosk";

    public static final String BANK_PROVIDER_BASE_URL = BASE_URL + "/bankprovider";
    public static final String CAMPUS_BASE_URL = BASE_URL + "/campus";
    public static final String DISCOUNT_BASE_URL = BASE_URL + "/discount";
    public static final String EVENT_BASE_URL = BASE_URL + "/event";
    public static final String LOCATION_BASE_URL = BASE_URL + "/location";
    public static final String LOG_BASE_URL = BASE_URL + "/log";
    public static final String ROOM_BOOKING_BASE_URL = BASE_URL + "/roombooking";
    public static final String ROOM_BASE_URL = BASE_URL + "/room";
    public static final String SPORT_BASE_URL = BASE_URL + "/sport";
    public static final String TAG_BASE_URL = BASE_URL + "/tag";
    public static final String USER_BASE_URL = BASE_URL + "/user";
    public static final String USER_PERSONALIZATION_BASE_URL = BASE_URL + "/userpersonalization";

    public static final String USER_REGISTER_URL = USER_BASE_URL + "/register";
    public static final String USER_LOGIN_URL = USER_BASE_URL + "/login";
    public static final String USER_LOGOUT_URL = USER_BASE_URL + "/logout";



    ResponseEntity<T> getById(@PathParam("id") Integer id);
    ResponseEntity<Page<T>> findAll(@PageableDefault(size = 25) Pageable page);
    ResponseEntity<T> create(@Valid @RequestBody T dto);
    ResponseEntity<T> update(@PathVariable("id") Integer id, @Valid @RequestBody T dto);
    ResponseEntity<Void> delete(@PathVariable("id") Integer id);
}
