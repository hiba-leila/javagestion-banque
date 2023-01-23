package dao.daoFiles;

import dao.IDao;
import presentation.modele.Client;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class ClientDao implements IDao<Client, Long> {


    @Override
    public List<Client> findAll() {
        List<Client> clients = null;
        try {
            List<String> lines =
                    Files.readAllLines(FileBasePaths.CLIENTS_TABLE.toPath());
            lines.remove(0);
            clients =
                    lines.stream()
                            .map(line -> {
                                Client cl = null;


                                return cl;
                            })
                            .collect(Collectors.toList());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return null;
    }

    @Override
    public Client findById(Long l) {
        return null;
    }

    @Override
    public Client save(Client client) {

        String idStr = null;
        Long id = null;

        try {
            idStr = Files.readString(Paths.get(FileBasePaths.FILEBASE_FOLDER+"/clientsIndex.txt"));
            id = Long.parseLong(idStr);
            id ++;

        } catch (IOException e) {
            id = 1L;
        }


        String clientStr =
                client.getId() + "\t\t\t" +
                        client.getNom() + "\t\t\t" +
                        client.getPrenom() + "\t\t\t" +
                        client.getLogin() + "\t\t\t" +
                        client.getMotDePasse() + "\t\t\t" +
                        client.getCin()+ "\t\t\t" +
                        (client.getEmail()!=null&&client.getEmail().trim().length()!=0?client.getEmail():"NULL")+ "\t\t\t" +
                        (client.getTel()!=null&&client.getTel().trim().length()!=0?client.getTel():"NULL")+ "\t\t\t" +
                        client.getSexe() + "\n";


        try {
            Files.writeString(FileBasePaths.CLIENTS_TABLE.toPath(), clientStr, StandardOpenOption.APPEND);
            Files.writeString(Paths.get(FileBasePaths.FILEBASE_FOLDER+"/clientIndew.txt"),client.getId().toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return null;
    }

    @Override
    public List<Client> saveAll(List<Client> liste) {
        return null;
    }

    @Override
    public Client update(Client client) {
        return null;
    }

    @Override
    public boolean delete(Client client) {
        return false;
    }

    @Override
    public boolean deleteByUD(Long l) {
        return false;
    }
}
