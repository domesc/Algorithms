package arrays;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Challenge at https://www.hackerrank.com/challenges/dynamic-array
 * Created by domesc on 14/05/16.
 */
public class DynamicArrays {
    public void readAndExecute(String fileName) {
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            execute(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execute(Stream<String> stream) {
        int n, q;
        List<ArrayList<Integer>> parameters = stream.map(line -> {
            String[] params = line.split(" ");
            ArrayList<Integer> list = new ArrayList<>();
            for (String param : params) {
                list.add(Integer.parseInt(param));
            }
            return list;
        }).collect(Collectors.toList());
        if (parameters.isEmpty())
            throw new IllegalArgumentException("The file must not be empty");

        if (parameters.get(0).size() == 2) {
            n = parameters.get(0).get(0);
            q = parameters.get(0).get(1);
        } else {
            throw new IllegalArgumentException("The first line of the file should contain only 2 numbers");
        }

        ArrayList<ArrayList<Integer>> seqList = initSeqList(n);
        int lastAns = 0;

        query(seqList, lastAns, parameters.subList(1, parameters.size()));
    }

    private void query(ArrayList<ArrayList<Integer>> seqList, int lastAns, List<ArrayList<Integer>> parameters) {
        if (parameters.isEmpty())
            return;

        ArrayList<Integer> queryParams = parameters.get(0);
        int queryType = queryParams.get(0);
        int x = queryParams.get(1);
        int y = queryParams.get(2);
        int index = (x ^ lastAns) % seqList.size();
        if (queryType == 1) {
            seqList.get(index).add(y);
        } else if (queryType == 2) {
            ArrayList<Integer> seq = seqList.get(index);
            int seqIndex = y % seq.size();
            lastAns = seq.get(seqIndex);
            System.out.println(lastAns);
        } else {
            throw new IllegalArgumentException("The query type must be 1 or 2");
        }
        query(seqList, lastAns, parameters.subList(1, parameters.size()));
    }

    private ArrayList<ArrayList<Integer>> initSeqList(int n) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0;i < n;i++) {
            list.add(new ArrayList<>());
        }
        return list;
    }
}
