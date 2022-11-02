package com.example.cicd.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("빌드 확인용 테스트")
public class BuildTest {

    @DisplayName("문자열 split 테스트")
    @Test
    void split() {
        final List<String> words = Arrays.stream("a,b,c".split(","))
                .collect(Collectors.toList());

        assertThat(words).containsExactly("a", "b", "c");
    }
}
