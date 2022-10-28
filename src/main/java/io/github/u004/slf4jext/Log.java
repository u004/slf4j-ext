/*
 * Copyright 2022 u004
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.u004.slf4jext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

import java.util.stream.Stream;

/**
 * A logging utility.
 *
 * <p>{@code Log} is the utility class
 * that wraps {@link Logger} and all the methods
 * with automatic type detection of the calling {@code Class},
 * so you do not need to pre-define a static constant
 * of the {@code Logger} instance from {@link LoggerFactory}.
 *
 * @since 2.0.3
 */
@SuppressWarnings("unused")
public final class Log {
	private static final String CLASS_NAME = Log.class.getName();

	private static String getCallerClassName() {
		StackTraceElement[] stackTrace = Thread.currentThread()
				.getStackTrace();

		return Stream.of(stackTrace)
				.skip(1)
				.map(StackTraceElement::getClassName)
				.filter(name -> !name.equals(CLASS_NAME))
				.findFirst()
				.orElse(CLASS_NAME);
	}

	private static Logger getLogger() {
		return LoggerFactory.getLogger(getCallerClassName());
	}

	/**
	 * Wrap {@link Logger#getName()}.
	 */
	public static String getName() {
		return getLogger().getName();
	}

	/**
	 * Wrap {@link Logger#isTraceEnabled()}.
	 */
	public static boolean isTraceEnabled() {
		return getLogger().isTraceEnabled();
	}

	/**
	 * Wrap {@link Logger#trace(String)}.
	 */
	public static void trace(String msg) {
		getLogger().trace(msg);
	}

	/**
	 * Wrap {@link Logger#trace(String, Object)}.
	 */
	public static void trace(String format, Object arg) {
		getLogger().trace(format, arg);
	}

	/**
	 * Wrap {@link Logger#trace(String, Object, Object)}.
	 */
	public static void trace(String format, Object arg1, Object arg2) {
		getLogger().trace(format, arg1, arg2);
	}

	/**
	 * Wrap {@link Logger#trace(String, Object...)}.
	 */
	public static void trace(String format, Object... arguments) {
		getLogger().trace(format, arguments);
	}

	/**
	 * Wrap {@link Logger#trace(String, Throwable)}.
	 */
	public static void trace(String msg, Throwable t) {
		getLogger().trace(msg, t);
	}

	/**
	 * Wrap {@link Logger#isTraceEnabled(Marker)}.
	 */
	public static boolean isTraceEnabled(Marker marker) {
		return getLogger().isTraceEnabled(marker);
	}

	/**
	 * Wrap {@link Logger#trace(Marker, String)}.
	 */
	public static void trace(Marker marker, String msg) {
		getLogger().trace(marker, msg);
	}

	/**
	 * Wrap {@link Logger#trace(Marker, String, Object)}.
	 */
	public static void trace(Marker marker, String format, Object arg) {
		getLogger().trace(marker, format, arg);
	}

	/**
	 * Wrap {@link Logger#trace(Marker, String, Object, Object)}.
	 */
	public static void trace(Marker marker, String format, Object arg1, Object arg2) {
		getLogger().trace(marker, format, arg1, arg2);
	}

	/**
	 * Wrap {@link Logger#trace(Marker, String, Object...)}.
	 */
	public static void trace(Marker marker, String format, Object... argArray) {
		getLogger().trace(marker, format, argArray);
	}

	/**
	 * Wrap {@link Logger#trace(Marker, String, Throwable)}.
	 */
	public static void trace(Marker marker, String msg, Throwable t) {
		getLogger().trace(marker, msg, t);
	}

	/**
	 * Wrap {@link Logger#isDebugEnabled()}.
	 */
	public static boolean isDebugEnabled() {
		return getLogger().isDebugEnabled();
	}

	/**
	 * Wrap {@link Logger#debug(String)}.
	 */
	public static void debug(String msg) {
		getLogger().debug(msg);
	}

	/**
	 * Wrap {@link Logger#debug(String, Object)}.
	 */
	public static void debug(String format, Object arg) {
		getLogger().debug(format, arg);
	}

	/**
	 * Wrap {@link Logger#debug(String, Object, Object)}.
	 */
	public static void debug(String format, Object arg1, Object arg2) {
		getLogger().debug(format, arg1, arg2);
	}

	/**
	 * Wrap {@link Logger#debug(String, Object...)}.
	 */
	public static void debug(String format, Object... arguments) {
		getLogger().debug(format, arguments);
	}

	/**
	 * Wrap {@link Logger#debug(String, Throwable)}.
	 */
	public static void debug(String msg, Throwable t) {
		getLogger().debug(msg, t);
	}

	/**
	 * Wrap {@link Logger#isDebugEnabled(Marker)}.
	 */
	public static boolean isDebugEnabled(Marker marker) {
		return getLogger().isDebugEnabled(marker);
	}

	/**
	 * Wrap {@link Logger#debug(Marker, String)}.
	 */
	public static void debug(Marker marker, String msg) {
		getLogger().debug(marker, msg);
	}

	/**
	 * Wrap {@link Logger#debug(Marker, String, Object)}.
	 */
	public static void debug(Marker marker, String format, Object arg) {
		getLogger().debug(marker, format, arg);
	}

	/**
	 * Wrap {@link Logger#debug(Marker, String, Object, Object)}.
	 */
	public static void debug(Marker marker, String format, Object arg1, Object arg2) {
		getLogger().debug(marker, format, arg1, arg2);
	}

	/**
	 * Wrap {@link Logger#debug(Marker, String, Object...)}.
	 */
	public static void debug(Marker marker, String format, Object... arguments) {
		getLogger().debug(marker, format, arguments);
	}

	/**
	 * Wrap {@link Logger#debug(Marker, String, Throwable)}.
	 */
	public static void debug(Marker marker, String msg, Throwable t) {
		getLogger().debug(marker, msg, t);
	}

	/**
	 * Wrap {@link Logger#isInfoEnabled()}.
	 */
	public static boolean isInfoEnabled() {
		return getLogger().isInfoEnabled();
	}

	/**
	 * Wrap {@link Logger#info(String)}.
	 */
	public static void info(String msg) {
		getLogger().info(msg);
	}

	/**
	 * Wrap {@link Logger#info(String, Object)}.
	 */
	public static void info(String format, Object arg) {
		getLogger().info(format, arg);
	}

	/**
	 * Wrap {@link Logger#info(String, Object, Object)}.
	 */
	public static void info(String format, Object arg1, Object arg2) {
		getLogger().info(format, arg1, arg2);
	}

	/**
	 * Wrap {@link Logger#info(String, Object...)}.
	 */
	public static void info(String format, Object... arguments) {
		getLogger().info(format, arguments);
	}

	/**
	 * Wrap {@link Logger#info(String, Throwable)}.
	 */
	public static void info(String msg, Throwable t) {
		getLogger().info(msg, t);
	}

	/**
	 * Wrap {@link Logger#isInfoEnabled(Marker)}.
	 */
	public static boolean isInfoEnabled(Marker marker) {
		return getLogger().isInfoEnabled(marker);
	}

	/**
	 * Wrap {@link Logger#info(Marker, String)}.
	 */
	public static void info(Marker marker, String msg) {
		getLogger().info(marker, msg);
	}

	/**
	 * Wrap {@link Logger#info(Marker, String, Object)}.
	 */
	public static void info(Marker marker, String format, Object arg) {
		getLogger().info(marker, format, arg);
	}

	/**
	 * Wrap {@link Logger#info(Marker, String, Object, Object)}.
	 */
	public static void info(Marker marker, String format, Object arg1, Object arg2) {
		getLogger().info(marker, format, arg1, arg2);
	}

	/**
	 * Wrap {@link Logger#info(Marker, String, Object...)}.
	 */
	public static void info(Marker marker, String format, Object... arguments) {
		getLogger().info(marker, format, arguments);
	}

	/**
	 * Wrap {@link Logger#info(Marker, String, Throwable)}.
	 */
	public static void info(Marker marker, String msg, Throwable t) {
		getLogger().info(marker, msg, t);
	}

	/**
	 * Wrap {@link Logger#isWarnEnabled()}.
	 */
	public static boolean isWarnEnabled() {
		return getLogger().isWarnEnabled();
	}

	/**
	 * Wrap {@link Logger#warn(String)}.
	 */
	public static void warn(String msg) {
		getLogger().warn(msg);
	}

	/**
	 * Wrap {@link Logger#warn(String, Object)}.
	 */
	public static void warn(String format, Object arg) {
		getLogger().warn(format, arg);
	}

	/**
	 * Wrap {@link Logger#warn(String, Object...)}.
	 */
	public static void warn(String format, Object... arguments) {
		getLogger().warn(format, arguments);
	}

	/**
	 * Wrap {@link Logger#warn(String, Object, Object)}.
	 */
	public static void warn(String format, Object arg1, Object arg2) {
		getLogger().warn(format, arg1, arg2);
	}

	/**
	 * Wrap {@link Logger#warn(String, Throwable)}.
	 */
	public static void warn(String msg, Throwable t) {
		getLogger().warn(msg, t);
	}

	/**
	 * Wrap {@link Logger#isWarnEnabled(Marker)}.
	 */
	public static boolean isWarnEnabled(Marker marker) {
		return getLogger().isWarnEnabled(marker);
	}

	/**
	 * Wrap {@link Logger#warn(Marker, String)}.
	 */
	public static void warn(Marker marker, String msg) {
		getLogger().warn(marker, msg);
	}

	/**
	 * Wrap {@link Logger#warn(Marker, String, Object)}.
	 */
	public static void warn(Marker marker, String format, Object arg) {
		getLogger().warn(marker, format, arg);
	}

	/**
	 * Wrap {@link Logger#warn(Marker, String, Object, Object)}.
	 */
	public static void warn(Marker marker, String format, Object arg1, Object arg2) {
		getLogger().warn(marker, format, arg1, arg2);
	}

	/**
	 * Wrap {@link Logger#warn(Marker, String, Object...)}.
	 */
	public static void warn(Marker marker, String format, Object... arguments) {
		getLogger().warn(marker, format, arguments);
	}

	/**
	 * Wrap {@link Logger#warn(Marker, String, Throwable)}.
	 */
	public static void warn(Marker marker, String msg, Throwable t) {
		getLogger().warn(marker, msg, t);
	}

	/**
	 * Wrap {@link Logger#isErrorEnabled()}.
	 */
	public static boolean isErrorEnabled() {
		return getLogger().isErrorEnabled();
	}

	/**
	 * Wrap {@link Logger#error(String)}.
	 */
	public static void error(String msg) {
		getLogger().error(msg);
	}

	/**
	 * Wrap {@link Logger#error(String, Object)}.
	 */
	public static void error(String format, Object arg) {
		getLogger().error(format, arg);
	}

	/**
	 * Wrap {@link Logger#error(String, Object, Object)}.
	 */
	public static void error(String format, Object arg1, Object arg2) {
		getLogger().error(format, arg1, arg2);
	}

	/**
	 * Wrap {@link Logger#error(String, Object...)}.
	 */
	public static void error(String format, Object... arguments) {
		getLogger().error(format, arguments);
	}

	/**
	 * Wrap {@link Logger#error(String, Throwable)}.
	 */
	public static void error(String msg, Throwable t) {
		getLogger().error(msg, t);
	}

	/**
	 * Wrap {@link Logger#isErrorEnabled(Marker)}.
	 */
	public static boolean isErrorEnabled(Marker marker) {
		return getLogger().isErrorEnabled(marker);
	}

	/**
	 * Wrap {@link Logger#error(Marker, String)}.
	 */
	public static void error(Marker marker, String msg) {
		getLogger().error(marker, msg);
	}

	/**
	 * Wrap {@link Logger#error(Marker, String, Object)}.
	 */
	public static void error(Marker marker, String format, Object arg) {
		getLogger().error(marker, format, arg);
	}

	/**
	 * Wrap {@link Logger#error(Marker, String, Object, Object)}.
	 */
	public static void error(Marker marker, String format, Object arg1, Object arg2) {
		getLogger().error(marker, format, arg1, arg2);
	}

	/**
	 * Wrap {@link Logger#error(Marker, String, Object...)}.
	 */
	public static void error(Marker marker, String format, Object... arguments) {
		getLogger().error(marker, format, arguments);
	}

	/**
	 * Wrap {@link Logger#error(Marker, String, Throwable)}.
	 */
	public static void error(Marker marker, String msg, Throwable t) {
		getLogger().error(marker, msg, t);
	}

	private Log() {
		throw new UnsupportedOperationException();
	}
}
