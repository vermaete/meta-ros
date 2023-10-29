# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Python API for point_cloud_transport"
AUTHOR = "Alejandro Hernández <alejandro@openrobotics.org>"
ROS_AUTHOR = "Alejandro Hernandez Cordero"
HOMEPAGE = "https://github.com/ros-perception/point_cloud_transport"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "point_cloud_transport"
ROS_BPN = "point_cloud_transport_py"

ROS_BUILD_DEPENDS = " \
    pluginlib \
    point-cloud-transport \
    pybind11-vendor \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-python-native \
    ament-cmake-ros-native \
    python-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    pluginlib \
    point-cloud-transport \
    pybind11-vendor \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    pluginlib \
    point-cloud-transport \
    pybind11-vendor \
    rclcpp \
    rpyutils \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/point_cloud_transport-release/archive/release/humble/point_cloud_transport_py/1.0.14-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/point_cloud_transport_py"
SRC_URI = "git://github.com/ros2-gbp/point_cloud_transport-release;${ROS_BRANCH};protocol=https"
SRCREV = "adb052f569d2399de4cd039675f6307e572f8ebe"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
