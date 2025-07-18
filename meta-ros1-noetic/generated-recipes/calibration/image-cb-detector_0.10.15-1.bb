# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Provide a node that extracts checkerboard corners from ROS images.     This package is still experimental and unstable.     Expect its APIs to change."
AUTHOR = "David Feil-Seifer <david.feilseifer@gmail.com>"
ROS_AUTHOR = "Vijay Pradeep"
HOMEPAGE = "http://ros.org/wiki/image_cb_detector"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "calibration"
ROS_BPN = "image_cb_detector"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    calibration-msgs \
    cv-bridge \
    geometry-msgs \
    image-transport \
    message-filters \
    message-generation \
    roscpp \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    calibration-msgs \
    cv-bridge \
    geometry-msgs \
    image-transport \
    message-filters \
    message-runtime \
    roscpp \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    calibration-msgs \
    cv-bridge \
    geometry-msgs \
    image-transport \
    message-filters \
    message-runtime \
    roscpp \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/calibration-release/archive/release/noetic/image_cb_detector/0.10.15-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/image_cb_detector"
SRC_URI = "git://github.com/ros-gbp/calibration-release;${ROS_BRANCH};protocol=https"
SRCREV = "7024ad11ad29cb8f84b0d66214cf73e8bcc35b7a"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
