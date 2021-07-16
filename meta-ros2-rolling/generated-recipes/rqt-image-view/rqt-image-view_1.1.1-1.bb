# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "rqt_image_view provides a GUI plugin for displaying images using image_transport."
AUTHOR = "Mabel Zhang <mabel@openrobotics.org>"
ROS_AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "http://wiki.ros.org/rqt_image_view"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_image_view"
ROS_BPN = "rqt_image_view"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    image-transport \
    qt-gui-cpp \
    qtbase \
    rclcpp \
    rqt-gui \
    rqt-gui-cpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rclcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    image-transport \
    qt-gui-cpp \
    rclcpp \
    rqt-gui \
    rqt-gui-cpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rqt_image_view-release/archive/release/rolling/rqt_image_view/1.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/rqt_image_view"
SRC_URI = "git://github.com/ros2-gbp/rqt_image_view-release;${ROS_BRANCH};protocol=https"
SRCREV = "ab34f1e22b99697cafb6d91d5632accf53f47442"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
