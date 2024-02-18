package day07.test;

import com.sun.security.jgss.GSSUtil;
import day07.domain.Movie;

import java.util.Scanner;

public class MovieService {
   private Scanner sc=new Scanner(System.in);

    private Movie[] movies;
    //movies从另一个类中传入，想要使用movies的数据，需要在构造方法中，将其赋值给成员变量
    public MovieService(Movie[] movies) {
        this.movies=movies;
    }

    public void start() {
        lo:
        while (true) {
            System.out.println("--------电影信息系统---------");
            System.out.println("请输入您的选择");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.根据id查询电影信息");
            System.out.println("3.退出");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    //行为：查询全部电影信息
                    queryMoiveInfos();
                    break;
                case 2:
                    idMovieInfos();
                    break;
                case 3:
                    System.out.println("感谢您的使用！");
                    break lo;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;
            }
        }
    }

    private void idMovieInfos() {
        System.out.println("请输入您要查询的电影编号");
        int inputId= sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movie movie=movies[i];

            if (inputId==movie.getId()){
                System.out.println("电影名称："+movie.getTitle()+
                        "\n上映时间："+movie.getTime()+
                        "\n评分："+movie.getScore()+
                        "\n区域："+movie.getArea()+
                        "\n类型："+movie.getType()+
                        "\n导演："+movie.getDirector()+
                        "\n演员："+movie.getStarring());
                return;
            }
        }
        System.out.println("您输入的编号不存在，请检查");
    }
/*
展示电影全部信息（名称和评分）
 */
    private void queryMoiveInfos() {
        //遍历数组，访问数组中的内存地址
        for (int i = 0; i < movies.length; i++) {
            //movies从构造方法传入时，是局部变量，需要将其赋值给成员变量
            Movie movie=movies[i];
            //直接打印对象名，会看到内存地址
            //使用get方法来获取信息并打印
            System.out.println(movie.getTitle()+"----"+movie.getScore());
        }
    }
}
