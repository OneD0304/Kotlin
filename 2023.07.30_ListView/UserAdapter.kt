package com.example.my_application

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class UserAdapter (val context: Context, val UserList: ArrayList<User>) : BaseAdapter() {
    // UserAdapter는 코드 연결하는 어댑터라고 생각하면 조금 편하다. (리스트 뷰에는 반드시 어댑터를 설정해줘야한다. 그리고 어댑터는 연결이 되었을 때 겟 뷰라는 녀석들이 호출이되며 뷰를 만들어낸다.)

    override fun getCount(): Int {
        return UserList.size

    }

    override fun getItem(positon: Int): Any { //어떤 아이템을 끌고 올 것인가.
        return UserList[positon]

    }

    override fun getItemId(positon: Int): Long {
        return 0

    }

    override fun getView(positon: Int, convertView: View?, p2: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.list_item_user, null)

        val profile = view.findViewById<ImageView>(R.id.ivprofile)
        val name = view.findViewById<TextView>(R.id.Tvname)
        val age = view.findViewById<TextView>(R.id.Tvage)
        val greet = view.findViewById<TextView>(R.id.Tvgeert)

        val user = UserList[positon]

        profile.setImageResource(user.profile)
        name.text = user.name
        age.text = user.age
        greet.text = user.greet

        return  view
    }
}