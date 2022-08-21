# SneakerView

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
