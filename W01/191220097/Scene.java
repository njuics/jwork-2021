public class Scene {
    Calabash calabashThree;
    Monster snake;
    Monster scorpion;

    public Scene() {
        calabashThree = new Calabash(1000, 20, 1000, "����");
        snake = new Monster(200, 15, 30, 2, "�߾�");
        scorpion = new Monster(400, 25, 40, 2, "Ы�Ӿ�");
    }

    public void play() {
        calabashThree.speakTo(snake, "�����ˣ�");
        calabashThree.breakItems("ħ��");

        snake.mood("��ŭ��ʹ��");
        scorpion.mood("���ܿ�ŭ,�������");
        scorpion.action("������������ϡ���ħ��");

        calabashThree.speakTo(snake, "������Щ���˾�������Ͷ����");

        snake.rolleyes();
        snake.mood("���Ŵ�Ц");
        snake.speakTo(calabashThree, "��ƾ��һ��ֽ����Ǿ���˿�ڣ����֪�������������");

        calabashThree.mood("��м��Ц");
        calabashThree.speakTo(snake, "����ʲô���£��������ó����ɣ�");

        snake.speakTo(calabashThree, "���ۣ�");
        snake.action("�Ӷ�����");

        calabashThree.action("������Ц");

        snake.mood("�е����ݺݵ�������");
        snake.speakTo(calabashThree, "���ѵ��������ⱦ����");

        calabashThree.mood("�����ں�");
        calabashThree.speakTo(snake, "��ɴ�����еı������ó����ɣ��һ�������������~");

        snake.speakTo(calabashThree, "ֻҪ�㶥��ס���������Ҿͽ�еͶ��������");

        calabashThree.mood("�����۾���д��������");
        calabashThree.speakTo(snake, "�ã�˵���㻰���������ţ�˭Ҫ����Ƥ��˭����ث�֣�");

        snake.speakTo(calabashThree, "������");
        snake.attack(calabashThree, 20);
        snake.attack(calabashThree, 20);

        calabashThree.speakTo(snake, "�����Ǹ�Ů�ˣ��ҵ�ͷ�ɲ���������ģ�");
    }

    public static void main(String[] args) {
        new Scene().play();
    }
}
