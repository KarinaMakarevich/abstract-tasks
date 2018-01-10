package by.epam.makarevich.entity;

import java.math.BigDecimal;
import java.util.ArrayList;

public class User implements Cloneable {
    private int id;
    private String name;
    private Long key;
    private BigDecimal balance;
    private ArrayList<String> friends;

    public User(int id, String name, Long key, BigDecimal balance, ArrayList<String> friends) {
        this.id = id;
        this.name = name;
        this.key = key;
        this.balance = balance;
        this.friends = friends;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public ArrayList<String> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<String> friends) {
        this.friends = friends;
    }

    @Override
    public int hashCode() {
        return 31 * id + ((name == null) ? 0 : name.hashCode()) + ((key == null) ? 0 : key.hashCode()) +
                ((balance == null) ? 0 : balance.hashCode()) + ((friends == null) ? 0 : friends.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        if (id != user.id) {
            return false;
        }
        if (name == null) {
            if (user.name != null) {
                return false;
            }
        } else if (!name.equals(user.name)) {
            return false;
        }
        if (key == null) {
            if (user.key != null) {
                return false;
            }
        } else if (key.longValue() != user.key.longValue()) {
            return false;
        }
        if (balance == null) {
            if (user.balance != null) {
                return false;
            }
        } else if (balance.doubleValue() != user.balance.doubleValue()) {
            return false;
        }
        if (friends == null) {
            if (user.friends != null) {
                return false;
            }
        } else if (friends.size() != user.friends.size()) {
            return false;
        } else {
            for (int i = 0; i < friends.size(); i++) {
                if (friends.get(i) == null) {
                    if (user.friends.get(i) != null) {
                        return false;
                    }
                } else if (!friends.get(i).equals(user.friends.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        user.friends = (ArrayList<String>) friends.clone();
        return user;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + "\nName: " + this.name + "\nKey: " + this.key + "\nBalance: " + this.balance +
                "\nFriends: " + arrayListToString();
    }

    private String arrayListToString() {
        String str = "";
        for (String friend : this.friends) {
            str += friend + "\n";
        }
        return str;
    }
}
