# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Code shared on static and dynamic type support of rmw_fastrtps_cpp."
AUTHOR = "Michel Hidalgo <michel@ekumenlabs.com>"
ROS_AUTHOR = "Ricardo González"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmw_fastrtps"
ROS_BPN = "rmw_fastrtps_shared_cpp"

ROS_BUILD_DEPENDS = " \
    fastcdr \
    fastrtps \
    fastrtps-cmake-module \
    rcpputils \
    rcutils \
    rmw \
    rmw-dds-common \
    rosidl-typesupport-introspection-c \
    rosidl-typesupport-introspection-cpp \
    tracetools \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
    fastrtps-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    fastcdr \
    fastrtps \
    fastrtps-cmake-module \
    rcpputils \
    rcutils \
    rmw \
    rmw-dds-common \
    rosidl-typesupport-introspection-c \
    rosidl-typesupport-introspection-cpp \
    tracetools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
    osrf-testing-tools-cpp \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rmw_fastrtps-release/archive/release/humble/rmw_fastrtps_shared_cpp/6.2.7-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/rmw_fastrtps_shared_cpp"
SRC_URI = "git://github.com/ros2-gbp/rmw_fastrtps-release;${ROS_BRANCH};protocol=https"
SRCREV = "09934ed50e193a04f06f3f8bfd51c5a5d8c309dc"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
