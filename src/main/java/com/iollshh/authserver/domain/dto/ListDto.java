package com.iollshh.authserver.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@AllArgsConstructor
@Data
public class ListDto implements Dto{
    List<Dto> dtoList;
}

