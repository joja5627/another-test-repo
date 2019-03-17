package io.example.async.streams;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertEquals;

public class TemporaryFolderTest {
    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

//    @Before
//    public void before() throws IOException {
//        File file = temporaryFolder.newFolder("F","s");
//        temporaryFolder.
//    }

    @Test
    public void filetTest(){

    }

    @Test
    public void copySomeDataToTmpFile() throws IOException {
        File file = temporaryFolder.newFile("test");
        OutputStream out = getOutputStream(file.toPath());
        try {
            out.write("TemporaryFolder Example".getBytes());
        }
        finally {
            try {
                out.close();
            }
            catch (IOException ex) {
            }
        }
        assertEquals(23, Files.size(file.toPath()));
        System.out.println("Content: " + Files.readAllLines(file.toPath()));
    }

    private OutputStream getOutputStream(Path path) throws IOException {
        if (Files.isDirectory(path)) {
            throw new FileNotFoundException(path + " (is a directory)");
        }
        return Files.newOutputStream(path);
    }
}
