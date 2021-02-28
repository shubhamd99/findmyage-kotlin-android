### FindMy Age Application with Kotlin


##### Activity
An Android activity is one screen of the Android app's user interface. In that way an Android activity is very similar to windows in a desktop application. An Android app may contain one or more activities, meaning one or more screens.

##### Layout
A layout defines the structure for a user interface in your app, such as in an activity. All elements in the layout are built using a hierarchy of View and ViewGroup objects. A View usually draws something the user can see and interact with. Whereas a ViewGroup is an invisible container that defines the layout structure for View and other ViewGroup objects

When you compile your app, each XML layout file (activity_main.xml) is compiled into a View resource. You should load the layout resource from your app code, in your Activity.onCreate() callback implementation. 

```
fun onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_layout)
}
```

![startup](https://i.imgur.com/khmlpTW.png)

![one_layout](https://i.imgur.com/h6xr6zz.png)

![activity_layout](https://i.imgur.com/BNs8jiY.png)

##### Constraint
![constraint](https://i.imgur.com/uzAp15A.png)