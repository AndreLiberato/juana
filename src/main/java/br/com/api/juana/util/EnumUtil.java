package br.com.api.juana.util;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import br.com.api.juana.enums.EntidadeEnum;

@Component
public class EnumUtil {
    public <T extends Enum<T>> Map<String, String> toChaveValor(T[] enumValues) {
        return Stream.of(enumValues)
                .collect(Collectors.toMap(
                        Enum::name,
                        e -> ((EntidadeEnum) e).getNome()));
    }

    public <T extends Enum<T>> Map<String, String> toChaveValor(T[] enumValues, Function<T, String> enumMethod) {
        return Stream.of(enumValues)
                .collect(Collectors.toMap(
                        Enum::name,
                        e -> enumMethod.apply(e)));
    }
}
