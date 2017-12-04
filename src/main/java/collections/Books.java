package collections;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Meyttt on 08.11.2017.
 */
public class Books {
    Set<String> bookTypes;
    Map<String, String> sections;
    List<String> readers;

    public Map<Reader, Book> getBookMap() {
        return bookMap;
    }

    public void setBookMap(Map<Reader, Book> bookMap) {
        this.bookMap = bookMap;
    }

    Map<Reader, Book> bookMap;

    public Books() {
    }

    public Set<String> getBookTypes() {
        return bookTypes;
    }

    public void setBookTypes(Set<String> bookTypes) {
        this.bookTypes = bookTypes;
    }

    public Map<String, String> getSections() {
        return sections;
    }

    public void setSections(Map<String, String> sections) {
        this.sections = sections;
    }

    public List<String> getReaders() {
        return readers;
    }

    public void setReaders(List<String> readers) {
        this.readers = readers;
    }

    class Reader {
        String name;
        int age;

        public Reader(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class Book {
        String title;
        UUID identifier;

        public Book(String title, UUID identifier) {
            this.title = title;
            this.identifier = identifier;
            System.out.println("nope");

        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public UUID getIdentifier() {
            return identifier;
        }

        public void setIdentifier(UUID identifier) {
            this.identifier = identifier;
        }
    }
}
