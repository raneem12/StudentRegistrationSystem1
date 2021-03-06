package model.Entities;

import java.io.Serializable;

/**
 * Created by rzzayed on 5/23/17.
 */
public class User implements Serializable
{
    private static final long serialVersionUID = 748392348L;
    private String name;
    private int id;
    private String username;
    private String password;



    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }


}
