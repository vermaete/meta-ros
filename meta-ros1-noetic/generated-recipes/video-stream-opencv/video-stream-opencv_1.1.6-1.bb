# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The video_stream_opencv package contains a node to publish a video stream (the protocols that     opencv supports are supported, including rtsp, webcams on /dev/video and video files) in ROS image topics, it supports camera info and basic image flipping (horizontal, vertical or both) capabilities, also adjusting publishing rate."
AUTHOR = "Sammy Pfeiffer <Sammy.Pfeiffer@student.uts.edu.au>"
ROS_AUTHOR = "Sammy Pfeiffer"
HOMEPAGE = "http://www.ros.org/wiki/video_stream_opencv"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "video_stream_opencv"
ROS_BPN = "video_stream_opencv"

ROS_BUILD_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    dynamic-reconfigure \
    image-transport \
    nodelet \
    roscpp \
    rospy \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    dynamic-reconfigure \
    image-transport \
    nodelet \
    roscpp \
    rospy \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    dynamic-reconfigure \
    image-transport \
    nodelet \
    roscpp \
    rospy \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
    rostopic \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-drivers/video_stream_opencv-release/archive/release/noetic/video_stream_opencv/1.1.6-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/video_stream_opencv"
SRC_URI = "git://github.com/ros-drivers/video_stream_opencv-release;${ROS_BRANCH};protocol=https"
SRCREV = "1a1ad5ad5872028c90f7f675b8088065af185793"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
