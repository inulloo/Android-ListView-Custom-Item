package net.inull.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.AlertDialog;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
  private List<Person> list = new ArrayList<Person>();
  ListView listView = null;

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    list.add(new Person("One", R.drawable.img_01, "json ccc"));
    list.add(new Person("Two", R.drawable.img_01, "json bbb"));
    list.add(new Person("Three", R.drawable.img_01, "json aaa"));
    list.add(new Person("Four", R.drawable.img_01, "json ttt"));
    list.add(new Person("Five", R.drawable.img_01, "json vvvv"));

    // 获得适配器
    PersonAdapter personAdapter = new PersonAdapter(this, R.layout.item, list);
    // 为ListView设置适配器
    listView = (ListView) this.findViewById(R.id.listView);
    listView.setAdapter(personAdapter);
    // 注册监听事件
    listView.setOnItemClickListener(onItemClick);
  }

  public AdapterView.OnItemClickListener onItemClick = new AdapterView.OnItemClickListener()
  {
    // 重写监听事件
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
      // 如果是listView对象被点击
      if (parent == listView)
      {
        // 获取show.xml布局文件的对象
        // 并分别拿到imageView和textView控件
        LinearLayout linearLayout = (LinearLayout) getLayoutInflater().inflate(R.layout.dialog, null);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.showImage);
        TextView textView = (TextView) linearLayout.findViewById(R.id.showText);

        // 拿到被选中的子项目的图片以及文字
        ImageView imageId = (ImageView) view.findViewById(R.id.imageId);
        TextView name = (TextView) view.findViewById(R.id.name);

        // 将被选中的子项目图片以及文字加载到imageView和textView中
        imageView.setImageDrawable(imageId.getDrawable());
        textView.setText(name.getText().toString());

        // 新建弹出窗类对象，并将linearLayout加载到该对象中
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("您选择了");
        builder.setView(linearLayout);
        builder.create();
        builder.show();
      }
    }
  };
}
