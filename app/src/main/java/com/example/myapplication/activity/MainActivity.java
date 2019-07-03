package com.example.myapplication.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.myapplication.R;
import com.example.myapplication.adapter.PageAdapter;
import com.example.myapplication.fragment.HomeFragment;
import com.example.myapplication.fragment.HotFragment;
import com.example.myapplication.fragment.MineFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
	// private List<Model> datas;
	// private MyAdapter adapter;
	public BottomNavigationView navigationView;
	public ViewPager viewPager;
	public PageAdapter pageAdapter;
	public List<Fragment> fragmentList;
	public HomeFragment homeFragment;
	public MineFragment mineFragment;
	public HotFragment hotFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		// init();
	}

	private void init() {
		// // 初始化RecyclerView
		// recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
		//
		// // 模拟的数据（实际开发中一般是从网络获取的）
		// datas = new ArrayList<>();
		// Model model;
		// for (int i = 0; i < 15; i++) {
		// model = new Model();
		// model.setTitle("我是第" + i + "条标题");
		// model.setDes("第" + i + "条内容");
		// datas.add(model);
		// }
		//
		// // 创建布局管理
		// LinearLayoutManager layoutManager = new LinearLayoutManager(this);
		// layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
		// recyclerView.setLayoutManager(layoutManager);
		//
		// // 创建适配器
		// adapter = new MyAdapter(R.layout.item, datas);
		//
		// // 给RecyclerView设置适配器
		// recyclerView.setAdapter(adapter);

	}

	private void initView() {
		homeFragment = new HomeFragment();
		hotFragment = new HotFragment();
		mineFragment = new MineFragment();
		fragmentList = new ArrayList<>();
		fragmentList.add(homeFragment);
		fragmentList.add(hotFragment);
		fragmentList.add(mineFragment);
		viewPager = findViewById(R.id.viewPage);
		navigationView = findViewById(R.id.navigation);
		navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
		pageAdapter = new PageAdapter(getSupportFragmentManager(), fragmentList);
		viewPager.setAdapter(pageAdapter);
		viewPager.setCurrentItem(0);
		viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			@Override
			public void onPageScrolled(int i, float v, int i1) {

			}

			@Override
			public void onPageSelected(int i) {
				if ( i == 0) {
					navigationView.setSelectedItemId(R.id.navigation_home);
				}else if (i == 1) {
					navigationView.setSelectedItemId(R.id.navigation_dashboard);
				}else {
					navigationView.setSelectedItemId(R.id.navigation_notifications);
				}
			}

			@Override
			public void onPageScrollStateChanged(int i) {

			}
		});
	}
	private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
			= new BottomNavigationView.OnNavigationItemSelectedListener() {

		@Override
		public boolean onNavigationItemSelected(@NonNull MenuItem item) {
			switch (item.getItemId()) {
				case R.id.navigation_home:
					viewPager.setCurrentItem(0);
					return true;
				case R.id.navigation_dashboard:
					viewPager.setCurrentItem(1);
					return true;
				case R.id.navigation_notifications:
					viewPager.setCurrentItem(2);
					return true;
			}
			return false;
		}
	};
}
