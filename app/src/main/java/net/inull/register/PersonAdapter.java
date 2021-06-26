package net.inull.register;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

// 自定义适配器

/**
 * Created by Aiden on 2016/2/18.
 */
public class PersonAdapter extends ArrayAdapter<Person>
{
  private int resourceId;

  // 初始化
  // 第一个参数是上下文，第二个参数是每个子项目的布局文件，第三个是每个子项目的内容
  public PersonAdapter(Context context, int textViewResourceId, List<Person> list)
  {
    super(context, textViewResourceId, list);
    // 得到加载子项目的资源文件
    resourceId = textViewResourceId;
  }

  // 重写getView()方法，用于将每个子项目都加载响应的资源
  @Override
  public View getView(int position, View convertView, ViewGroup viewGroup)
  {
    // 得到被选中的子项目
    Person language = this.getItem(position);
    // 得到被选中的资源文件
    View view = LayoutInflater.from(this.getContext()).inflate(resourceId, null);
    // 加载图片
    ImageView imageView = (ImageView) view.findViewById(R.id.imageId);
    imageView.setImageResource(language.getImageId());
    // 加载文字
    TextView name = (TextView) view.findViewById(R.id.name);
    name.setText(language.getName());

    return view;
  }
}
