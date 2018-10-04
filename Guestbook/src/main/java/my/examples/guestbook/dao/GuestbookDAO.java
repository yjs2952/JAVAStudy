package my.examples.guestbook.dao;

import my.examples.guestbook.servlet.Guestbook;

import java.util.List;

public interface GuestbookDAO {
    List<Guestbook> getList();
    int addGuestbook(Guestbook guestbook);
    int deleteGuestbook(int id);
}
