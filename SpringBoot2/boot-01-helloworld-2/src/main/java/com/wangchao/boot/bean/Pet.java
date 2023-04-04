package com.wangchao.boot.bean;

import lombok.*;

/**
 * @author Wang Chao
 * @create 2023/2/28 22:24
 */
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    private String name;
    private Double weight;
}
