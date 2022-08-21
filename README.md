# SneakerView


 | <image src=https://user-images.githubusercontent.com/80040232/185810460-5e6c0e93-223a-41ac-97ef-56fc3b70c528.gif width="250"> | <image src=https://user-images.githubusercontent.com/80040232/185810524-f01fa6bf-ccf9-4ab4-8872-5a024082072a.gif width="250"> | <image src=https://user-images.githubusercontent.com/80040232/185810558-e5c6d8fd-e8c4-43b5-b6ec-f7699b054737.gif width="250"> |
| --- | --- | ---
 
  | <image src=https://user-images.githubusercontent.com/80040232/185810590-aa3fc607-7095-408c-a800-976222e9e2fe.gif width="250"> | <image src=https://user-images.githubusercontent.com/80040232/185810633-842b3924-59b7-44d3-8450-1331b9555668.gif width="250"> |
| --- | ---
  

## How to install ? 
You can add the library to your project using jitpack.io.

Add the code below to your project's settings.gradle file.

```
 allprojects {
        repositories {
            jcenter()
            maven { url "https://jitpack.io" }
        }
   }
```
Add the code below to your app's gradle file.
```
implementation 'com.github.furkanakak:SneakerView:1.1'
```

## Usage

For Sweet Success with Short Duration, Top Padding and Aligment : 
```
 binding.success.setOnClickListener {
            Log.v("sneaker","success")
            Sneaker.Builder()
                .setActivity(this) /* optionally, these -> .setFragment() .setViewGroup() */
                .setType(SneakerType.Success)
                .setTitle("Success")
                .setSneakerDuration(3000)
                .setContent("Your transaction was successful")
                .setIconVisible(true)
                .setAnimateDuration(1000)
                .setAnimationRepeatCount(3)
                .setArrowIcon(true)
                .setButtonName("Action")
                .setAutoHide(false)
                .setArrowIcon(true)
                .setAnimation(true)
                .setButtonIconListener(object : SneakerListener {
                    override fun onClickListener() {
                        Log.v("buttonClick","buttonClick")
                    }
                })
                .build()
```




