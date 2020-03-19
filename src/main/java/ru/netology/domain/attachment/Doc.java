package ru.netology.domain.attachment;

public class Doc {
    private int Id;
    private int size;
    private int ownerId;
    private String ext;
    private String title;
    private String url;
    private int type; //1 — текстовые документы;2 — архивы;3 — gif;4 — изображения;5 — аудио;6 — видео;7 — электронные книги;8 — неизвестно.
    private int date;
}
