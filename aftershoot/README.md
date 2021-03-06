# DeClutter and Camera Modules for AfterShoot

## DeClutter
This is an extension to the AfterShoot camera app, that will query the internal storage for all the images and filter the bad pictures from the bunch.

![](https://i.imgur.com/DYNJ1WE.png)
![](https://i.imgur.com/JAcHq25.png)
![](https://i.imgur.com/KokdGiC.png)
![](https://i.imgur.com/xMp6FBz.png)

### Feature List
- [x] Permission Handling
- [x] Query Internal Storage
- [x] Implement scoped storage
- [x] Integrate exposure model
- [x] Integrate blur model
- [x] Integrate blink model
- [ ] Integrate cropped_faces model
- [x] Implement db to cache inference results
- [ ] Handle deleton
- [ ] Handle user feedback
- [ ] Add Login
- [ ] Connect and analyze Images backed up on Google Photos

## AfterShoot Camera
The Main camera module that analyzes the images in real time as you're taking them and suggest fixes that can be made to imrpove them.
It can also analyze the picture once it's taken for potential flaws.

![](https://i.imgur.com/Ll5gA1F.png)

## Feature list  
- [x] Taking Pictures  
- [x] Recording Videos  
- [ ] Identify Bad Pictures  
- [ ] Apply/Suggest Recommended Fixes  

The camera module is based on the Open Source Camera Client called [Simple Camera](https://github.com/SimpleMobileTools/Simple-Camera)
