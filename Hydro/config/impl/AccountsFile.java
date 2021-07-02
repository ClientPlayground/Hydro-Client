package Hydro.config.impl;

import java.io.File;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import Hydro.altManager.Alt;
import Hydro.altManager.AltManager;
import Hydro.config.IFile;

public class AccountsFile implements IFile {

    private File file;

    @Override
    public void save(Gson gson) {
        JsonArray array = new JsonArray();

        AltManager.registry.forEach(alt -> {
            JsonObject object = new JsonObject();

            object.addProperty("mask", alt.getMask());
            object.addProperty("username", alt.getUsername());
            object.addProperty("password", alt.getPassword());

            array.add(object);
        });

        writeFile(gson.toJson(array), file);
    }

    @Override
    public void load(Gson gson) {
        if (!file.exists()) {
            return;
        }
        Account[] accounts = gson.fromJson(readFile(file), Account[].class);
        if (accounts != null) {
            Arrays.stream(accounts).forEach(account -> AltManager.registry.add(new Alt(account.username, account.password, account.mask)));
        }
    }

    @Override
    public void setFile(File root) {
        file = new File(root, "/accounts.txt");
    }

    final class Account {

        @SerializedName("mask")
        final String mask;

        @SerializedName("username")
        final String username;

        @SerializedName("password")
        final String password;

        Account(String mask, String username, String password) {
            this.mask = mask;
            this.username = username;
            this.password = password;
        }

    }

}

