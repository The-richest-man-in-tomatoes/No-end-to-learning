package demo12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/mac/工作文档/业务需求/20220630/20220607-zhanghy-delete-bill_toolbar（带检查）.sql");
        Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8);

        Stream<String> stringStream = lines.flatMap(line -> Stream.of(line.toUpperCase()));
        stringStream.forEach(x -> {
            try {
                // bug 只能存最后一行
                BufferedWriter bufferedWriter = Files.newBufferedWriter(path);
                bufferedWriter.write(x);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
