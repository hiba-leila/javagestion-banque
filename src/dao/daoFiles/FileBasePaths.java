package dao.daoFiles;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public interface FileBasePaths {

    File FILEBASE_FOLDER = new File("MyFileBase");

    File LOGS_FOLDER = new File(FILEBASE_FOLDER.getAbsolutePath() +"/logs");

    File CLIENTS_TABLE = new File(FILEBASE_FOLDER.getAbsolutePath() +"/client.txt");

    File ACCOUNTS_TABLE = new File(FILEBASE_FOLDER.getAbsolutePath() +"/accounts.txt");

    File BANK_AGENCEIES_TABLE = new File(FILEBASE_FOLDER.getAbsolutePath() +"/agencies.txt");



    private static void ceateFolderOrFile(File path, boolean isFile, String header){
        if (isFile){
            if (!path.exists()){
                try {
                    path.createNewFile();
                    Files.writeString(path.toPath(),header);
                    System.out.println(path.getName() + "créé avec succès");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else System.out.println(path.getName()+"existe déja");
        }
        else {
            if (!path.exists()) {
                path.mkdir();
                System.out.println(path.getName() + "créé avec succès");
            }
            else System.out.println(path.getName()+"existe déja");
        }
    }

    static void createFileBase(){
        ceateFolderOrFile(FILEBASE_FOLDER, false,"");
        ceateFolderOrFile(LOGS_FOLDER, false,"");
        String clientsHeader = "ID\t\t\tNom\t\t\tPrenom\t\t\tLogin\t\t\tMot de passe\t\t\tCIN\t\t\tEmail\t\t\tTele\t\t\tSexe\n";
        ceateFolderOrFile(CLIENTS_TABLE, true,clientsHeader);
        String accountsHeader = "ID\t\t\tDateCreation\t\t\tSolde\t\t\tIdClient\n";
        ceateFolderOrFile(ACCOUNTS_TABLE, true,accountsHeader);
        String agenciesHeader = "ID\t\t\tNom\t\t\tEmail\t\t\tTel\t\t\tAdresse\n";
        ceateFolderOrFile(BANK_AGENCEIES_TABLE, true,agenciesHeader);

    }


}
