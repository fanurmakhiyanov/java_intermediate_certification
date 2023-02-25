package org.example.model;

public class Toy {
    private Integer id;
    private String summary;
    private Integer amount;
    private Integer rank;


    public Toy(Integer id, String summary, Integer amount, Integer rank) {
        this.id = id;
        this.summary = summary;
        this.amount = amount;
        this.rank = rank;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getRank() {
        return rank;
    }

    public void setFrequency(Integer rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Название: %s, Количество: %d, Вес: %d",
                id, summary, amount, rank);
    }

}