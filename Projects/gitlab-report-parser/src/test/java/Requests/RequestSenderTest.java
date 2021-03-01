package Requests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestSenderTest {

    private RequestSender rs;

    @BeforeEach
    void setUp() {
        rs = new RequestSender();
    }

    @Test
    void sendGet() {
        String expected = "{\n" +
                "  \"userId\": 1,\n" +
                "  \"id\": 1,\n" +
                "  \"title\": \"delectus aut autem\",\n" +
                "  \"completed\": false\n" +
                "}";
        assertEquals(expected, rs.sendGet("https://jsonplaceholder.typicode.com/todos/1"));
    }

    @Test
    void sendGetNull() {
        String expected = null;
        assertEquals(expected, rs.sendGet(null));
    }

    @Test
    void sendPost() {
        String content = "{\n" +
                "      title: 'foo',\n" +
                "      body: 'bar',\n" +
                "      userId: 1\n" +
                "    }";
        String expected = "{\n" +
                "  \"{\\n      title: 'foo',\\n      body: 'bar',\\n      userId: 1\\n    }\": \"\",\n" +
                "  \"id\": 101\n" +
                "}";
        assertEquals(expected, rs.sendPost("https://jsonplaceholder.typicode.com/posts", content));
    }

    @Test
    void sendPostNull() {
        String content = null;
        assertEquals(null, rs.sendPost("https://jsonplaceholder.typicode.com/posts", content));
    }

    @Test
    void sendRequestNull() {
        assertEquals(null, rs.sendRequest(null));
    }
}